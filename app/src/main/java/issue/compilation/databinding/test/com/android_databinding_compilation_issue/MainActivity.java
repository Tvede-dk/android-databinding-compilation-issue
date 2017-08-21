package issue.compilation.databinding.test.com.android_databinding_compilation_issue;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import issue.compilation.databinding.test.com.android_databinding_compilation_issue.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //will fail when having a w600dp screen.
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
