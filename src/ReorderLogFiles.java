import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * FileName: ReorderLogFiles
 * Description: 重新排列日志文件
 * Author:   @VirtualChen
 * Date:     2018/12/27 0027 下午 7:39
 */

public class ReorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        List<String> numList = new ArrayList<>();
        List<String> letterList = new ArrayList<>();
        for (String s : logs) {
            int index = s.indexOf(" ");
            char c = s.charAt(index + 1);
            if (c >= '0' && c <= '9')
                numList.add(s);
            else
                letterList.add(s);
        }

        Collections.sort(letterList, (o1, o2) -> {
            int indexo1 = o1.indexOf(" ");
            int indexo2 = o2.indexOf(" ");
            String substro1 = o1.substring(indexo1 + 1);
            String substro2 = o2.substring(indexo2 + 1);
            return substro1.compareTo(substro2);
        });
        String[] sortedLogs = new String[logs.length];
        int i = 0;
        for (String s : letterList) {
            sortedLogs[i++] = s;
        }

        for (String s : numList) {
            sortedLogs[i++] = s;
        }
        return sortedLogs;
    }
}
