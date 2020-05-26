package kr.co.tjoeun.sharedpreferences_20200526;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import kr.co.tjoeun.sharedpreferences_20200526.databinding.ActivitySignUpBinding;

public class SignUpActivity extends BaseActivity {

    ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        binding.emailEdt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String input = s.toString();
                Log.d("변경된내용", input);

//                @를 포함 + 6글자 이상. => 이메일로 인정
                if (input.contains("@") && input.length() >= 6) {
                    binding.emailCheckResultTxt.setText("사용해도 좋은 이메일 입니다.");
                }
                else {
                    if (input.length() == 0) {
                        binding.emailCheckResultTxt.setText("이메일을 입력해주세요.");
                    }
                    else {
                        binding.emailCheckResultTxt.setText("이메일 양식으로 입력해주세요.");
                    }

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    public void setValues() {

    }
}
