package kr.co.tjoeun.sharedpreferences_20200526.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class ContextUtil {


//    메모장의 파일명에 대응되는 개념.
    private static final String prefName = "practicePref";


//    항목의 이름에 오타를 내지 않기 위해 변수로 만들고 => 자동완성 활용
    private static final String USER_ID = "USER_ID";

//    아이디를 받아서 저장해주는 메쏘드
    public static void setUserId(Context context, String inputId) {

        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        pref.edit().putString(USER_ID, inputId).apply();

    }

//    메모장에 기록된 아이디를 받아서 리턴해주는 메쏘드
    public static String getUserId(Context context) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        return pref.getString(USER_ID, "");
    }


}
