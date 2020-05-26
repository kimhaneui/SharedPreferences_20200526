package kr.co.tjoeun.sharedpreferences_20200526;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import kr.co.tjoeun.sharedpreferences_20200526.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isIdSave = binding.idSaveCheckBox.isChecked();

                if (isIdSave) {
                    Toast.makeText(mContext, "아이디 저장 필요", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(mContext, "아이디 저장 안함", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    public void setValues() {

    }
}
