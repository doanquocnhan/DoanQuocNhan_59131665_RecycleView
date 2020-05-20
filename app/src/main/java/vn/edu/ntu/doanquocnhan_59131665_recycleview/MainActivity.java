package vn.edu.ntu.doanquocnhan_59131665_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intView();
    }
    public void  intView(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager =  new LinearLayoutManager( this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<product> arrayList = new ArrayList<>();
        arrayList.add(new product("Quốc Nhan","08061999","01613736529"));
        arrayList.add(new product("Quốc Nhan1","08061999","01613736529"));
        arrayList.add(new product("Quốc Nhan2","08061999","01613736529"));
        arrayList.add(new product("Quốc Nhan3","08061999","01613736529"));
        Adapter adapter = new Adapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
