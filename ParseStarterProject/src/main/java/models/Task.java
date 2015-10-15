package models;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.text.ParseException;

/**
 * Created by Sofienne LASSOUED on 16/10/2015.
 */
@ParseClassName("Task")
public class Task extends ParseObject{
    //name
    public String getName(){
        return getString("name");
    }

    public void setName(String name){
        put("name", name);
    }
    //done
    public boolean isDone(){
        return getBoolean("done");
    }

    public void setDone(boolean done){
        put("done", done);
    }

    //deleted

    //important
    public boolean isImportant(){
        return getBoolean("important");
    }

    public void setImportant(boolean important){
        put("important", important);
    }

    public static ParseQuery<Task> getQuery() {
        return ParseQuery.getQuery(Task.class);
    }
}
