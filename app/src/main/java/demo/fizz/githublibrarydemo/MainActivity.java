package demo.fizz.githublibrarydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import demo.fizz.githublibrary.GitHubLibraryUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView toastTv = findViewById(R.id.main_activity_toast_tv);
        toastTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GitHubLibraryUtils.toastWhat(MainActivity.this, "测试效果~~~");
            }
        });
    }
}
