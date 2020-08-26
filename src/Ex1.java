import sun.plugin.javascript.navig.Link;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        String[] months = new String[]
                {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
                "Сентябрь", "Октябрь", "Ноябрь", "Декабрь", "Январь", "Февраль", "Март",
                "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

        Set<String> set = new LinkedHashSet<String>(Arrays.asList(months));
        System.out.println(set);
        List<String> list = new ArrayList<String>(Arrays.asList(months));
        System.out.println(list);
        Map<String,Integer> map = new LinkedHashMap<>();
        for (String s : set) {
            System.out.printf("%s встречается %s раза \n", s, Collections.frequency(list,s));
        }

    }
}
