/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dave Gershman
 */

package ucf.assignments;

import com.google.gson.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.Reader;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class TodoListFile {

    // Read a special json file containing TodoList data from the path
    // Read each item separately
    // Extract the date string and properly format it
    // Return new todolist with all items together
    public static TodoList GetTodoList(String path) throws Exception {
        Reader reader = Files.newBufferedReader(Paths.get(path));

        if (path.contains(".json")) {
            JsonArray itemsJson = JsonParser.parseReader(reader).getAsJsonArray();

            TodoList todoList = new TodoList();
            for (JsonElement itemElement : itemsJson) {

                JsonObject itemJson = itemElement.getAsJsonObject();
                Boolean complete = itemJson.get("isComplete").getAsBoolean();
                String desc = itemJson.get("description").getAsString();
                String dateString = itemJson.get("dueDate").getAsString();

                var dateSplit = dateString.split("/");
                int month = Integer.parseInt(dateSplit[0]) - 1;
                int day = Integer.parseInt(dateSplit[1]);
                int year = Integer.parseInt(dateSplit[2]);

                var date = new GregorianCalendar(year, month, day).getTime();

                todoList.AddItem(new Item(desc, date, complete));
            }

            reader.close();
            return todoList;
        }

        reader.close();
        return new TodoList();
    }

    public static void ExportTodoList(TodoList todoList, String dir) throws Exception {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(dir + "\\todoList.json"));

        var itemMapArray = new ArrayList<HashMap<String, Object>>();

        for (Item item : todoList.items) {
            var itemMap = new HashMap<String, Object>();
            itemMap.put("isComplete", item.isComplete.get());
            itemMap.put("description", item.description.get());

            Calendar cal = new GregorianCalendar();
            cal.setTime(item.dueDate);

            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            itemMap.put("dueDate", dateFormat.format(item.dueDate));

            itemMapArray.add(itemMap);
        }

        Gson gson = new Gson();
        writer.write(gson.toJson(itemMapArray));

        writer.close();

        // Serialize the todoList into a json string
        // Locate the directory provided in 'dir'
        // Create a new json file with the json string in the directory
        // Title this file the same title as the todolist
    }
}
