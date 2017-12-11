package layout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.lenovo.myapplication.Message;
import com.example.lenovo.myapplication.R;
import com.example.lenovo.myapplication.messageAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    List<Message> messagesmList = new ArrayList<>();
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    ListView l1;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        l1 = (ListView) view.findViewById(android.R.id.list);
        initpeoplem();
        messageAdapter adapter = new messageAdapter(getActivity(),R.layout.item1,messagesmList);
        l1.setAdapter(adapter);
        return view;


}
    private void initpeoplem(){
            Message jack = new Message("Jack", R.drawable.tx,"Hello!!!");
            messagesmList.add(jack);
            Message jack1 = new Message("和无语", R.drawable.tou5,"吃饱了。");
            messagesmList.add(jack1);
            Message jack2 = new Message("右左", R.drawable.tou10,"来自西伯利亚的冷空气");
            messagesmList.add(jack2);
            Message jack3 = new Message("高凡", R.drawable.tou4,"**************");
            messagesmList.add(jack3);
            Message jack4 = new Message("汪秦华", R.drawable.tou3,"56512458741244");
            messagesmList.add(jack4);

    }
}
