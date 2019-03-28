package khoapham.ptp.phamtanphat.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 10;
        int b = 15;
        int ketqua = a + b;
        // System :
        //To hop phim goi y tham so truyen vao : ctr + P
        //Xem gia tri trong he thong
//        Log.d("BBB",ketqua + "");
        //Thong bao ra man hinh
        Toast.makeText(this, "Xin chao", Toast.LENGTH_SHORT).show();
    }
}
