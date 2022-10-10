package com.example.gkandroid.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.example.gkandroid.Food;
import com.example.gkandroid.FoodAdapter;
import com.example.gkandroid.R;
import com.example.gkandroid.TruyenFood;

import java.util.ArrayList;

public class HomeFragment extends ListFragment {
    ArrayList<Food> arrayFood;
    FoodAdapter adapter;
    TruyenFood truyenFood;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        truyenFood = (TruyenFood) getActivity();
        anhxa();
        adapter = new FoodAdapter(getActivity(), R.layout.row_food, arrayFood);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        truyenFood.DataFood(arrayFood.get(position));
    }

    private void anhxa(){
        arrayFood = new ArrayList<>();
        arrayFood.add(new Food("Bánh mỳ thịt", R.drawable.banhmi,5.2));
        arrayFood.add(new Food("Hoành thánh", R.drawable.hoanhthanh, 6.1));
        arrayFood.add(new Food("Cao lầu", R.drawable.caolau, 5.5));
        arrayFood.add(new Food("Hot dog", R.drawable.hotdog,7.8));
        arrayFood.add(new Food("Mỳ quảng", R.drawable.myquang, 8.3));
        arrayFood.add(new Food("Cơm tấm", R.drawable.comtam, 9.2));
        arrayFood.add(new Food("Hamburger", R.drawable.hambuger1, 10.1));
        arrayFood.add(new Food("Phở", R.drawable.pho, 12.1));
    }

}
