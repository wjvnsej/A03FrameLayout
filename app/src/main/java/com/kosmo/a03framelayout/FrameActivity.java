package com.kosmo.a03framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameActivity extends AppCompatActivity {

    //이미지를 표현할 때 사용하는 뷰 객체
    ImageView dream01; //숨김상테
    ImageView dream02; //보임상태

    int imageToggle = 0; //이미지 토글을 위한 전역변수

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        //res에 저장된 이미지를 ID값을 통해 가져와서 전역변수에 저장
        dream01 = (ImageView)findViewById(R.id.dream01);
        dream02 = (ImageView)findViewById(R.id.dream02);
    }////onCreate End

    /*
    버튼을 클릭(onClick)하여 함수를 호출할 때는 매개변수로 반드시 View 객체를
    전달해야 한다. 메소드 정의시 파라미터로 받을 수 있도록 기술한다.
     */
    public void imageChange(View v){
        if(imageToggle == 0){
            dream01.setVisibility(v.VISIBLE); //보임처리
            dream02.setVisibility(v.INVISIBLE); //숨김처리
            imageToggle = 1;
        }
        else if(imageToggle == 1){
            dream01.setVisibility(v.INVISIBLE); //보임처리
            dream02.setVisibility(v.VISIBLE); //숨김처리
            imageToggle = 0;
        }
    }////imageChange End

    public void returnMain(View v){
        //현재 실행중인 액티비티 종료
        finish();
    }////returnMain End

}
