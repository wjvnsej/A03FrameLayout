package com.kosmo.a03framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //버튼 객체를 가져와서 리스너를 부착. 클릭했을 때 두번째 액티비티 띄워줌줌
       Button btn_second = (Button)findViewById(R.id.btn_second);
        btn_second.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        FrameActivity.class);
                startActivity(intent);
            }
        });

    }
}
