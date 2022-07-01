package com.example.pci_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.pci_project.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // ProgreeDialog → 화면 위에 띄워져서 어떤 처리를 하는 동안 사용자에게
        // 어떤 처리가 이루어지고 있음을 알려주는 위젯
        ProgressDialog dialog = new ProgressDialog(SplashActivity.this);
        //dialog.show();  // 로딩하는 동안을 실제 보여줌 (인스턴스)
        //ProgressDialog.show(SplashActivity.this, "타이틀", "메세지"); // 스태틱

        // ↓ 필요하면 복붙해서 사용하고 외우려고 하지말기
        // 단, 인터페이스를 파라메터로 입력받는 메소드 호출 하는 방법을 알고 있어야 함
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);  // 새로운 액티비티로 연결(MainActivity 로 시작함)
                finish();   // 뒤로가기 했을 때 현재 화면을 완전히 종료 처리
            }
        } , 3000);  // 3 초를 지연시키고 코드를 실행 함 딜레이


    }//onCreate

}//class