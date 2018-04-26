package demo.fizz.githublibrary;

import android.content.Context;
import android.widget.Toast;

public class GitHubLibraryUtils {

    public static void toastWhat(Context context, String what) {
        Toast.makeText(context, what, Toast.LENGTH_SHORT).show();
    }

    public static void toastWhat(Context context, int what) {
        Toast.makeText(context, what, Toast.LENGTH_SHORT).show();
    }

}
