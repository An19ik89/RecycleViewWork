package com.example.anik.recycleviewwork.Model;

/**
 * Created by Anik on 2/23/2017.
 */
import java.util.ArrayList;
import java.util.List;
public class DerpData {
    private static final String[] titles={"ok done",
                                           "ok not",
                                           "try harder"
                                          };
    private static final int[] icons={ android.R.drawable.ic_popup_reminder,
                                       android.R.drawable.ic_menu_add,
                                       android.R.drawable.ic_menu_delete
                                      };
    public static List<ListItem>getListData(){
        List<ListItem>data= new ArrayList<>();
        for (int x=0;x < 4 ;x++){
            for (int i= 0; i<titles.length && i<icons.length;i++){
                ListItem item =new ListItem();
                item.setImgResid(icons[i]);
                item.setTitle(titles[i]);
                data.add(item);
            }
        }
        return data;
    };
}
