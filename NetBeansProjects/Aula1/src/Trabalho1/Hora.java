package Trabalho1;

import java.util.Calendar;

public class Hora {
    public static String atual()
    {
        Calendar date = Calendar.getInstance();
        return date.getTime().getHours()+":"+date.getTime().getMinutes()+":"+date.getTime().getSeconds();
    }
}
