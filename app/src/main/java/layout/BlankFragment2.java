package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.lenovo.myapplication.PeopleAdapter;
import com.example.lenovo.myapplication.R;
import com.example.lenovo.myapplication.people;

import java.util.ArrayList;
import java.util.List;


public class BlankFragment2 extends Fragment {

    List<people> peopleList = new ArrayList<>();
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        ListView l2 =(ListView) view.findViewById(android.R.id.list);
        initpeople();
        PeopleAdapter adapter = new PeopleAdapter(getActivity(),R.layout.item2,peopleList);
        l2.setAdapter(adapter);
        return view;
    }



    private void initpeople(){
        people jack = new people("Jack", R.drawable.tou1);
        peopleList.add(jack);

        people jack1 = new people("陈小杰", R.drawable.tx);
        peopleList.add(jack1);

        people jack2 = new people("彭思博", R.drawable.tou2);
        peopleList.add(jack2);

        people jack3 = new people("汪秦华", R.drawable.tou3);
        peopleList.add(jack3);

        people jack4 = new people("高凡", R.drawable.tou4);
        peopleList.add(jack4);

        people jack5 = new people("和无语", R.drawable.tou5);
        peopleList.add(jack5);

        people jack6 = new people("邓吴嘉", R.drawable.tou6);
        peopleList.add(jack6);

        people jack7 = new people("无美丽", R.drawable.tou7);
        peopleList.add(jack7);

        people jack8 = new people("张独", R.drawable.tou8);
        peopleList.add(jack8);

        people jack9 = new people("可何壹", R.drawable.tou9);
        peopleList.add(jack9);

        people jack10 = new people("右左", R.drawable.tou10);
        peopleList.add(jack10);

        people jack11 = new people("呵左", R.drawable.tou11);
        peopleList.add(jack11);
    }


}
