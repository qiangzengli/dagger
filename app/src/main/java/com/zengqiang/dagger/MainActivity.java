package com.zengqiang.dagger;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.zengqiang.dagger.bean.Student;
import com.zengqiang.dagger.component.DaggerMainActivityComponent;
import com.zengqiang.dagger.module.MainActivityModule;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Inject
    Student student;

    @BindView(R.id.btn_show)
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DaggerMainActivityComponent
                .builder()
                .build()
                .inject(this);

    }

    @OnClick(R.id.btn_show)
    public void onViewClicked() {
        Toast.makeText(this, student.toString(), Toast.LENGTH_SHORT).show();
    }
}
