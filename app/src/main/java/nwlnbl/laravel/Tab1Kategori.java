package nwlnbl.laravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nabil on 4/16/17.
 */

public class Tab1Kategori extends Fragment {
    private ViewStub stubGrid;
    private GridView gridView;
    private GridViewAdapter gridViewAdapter;
    private List<Product> productList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1kategori, container, false);
        stubGrid = (ViewStub) rootView.findViewById(R.id.stub_grid);
        stubGrid.inflate();
        gridView = (GridView) rootView.findViewById(R.id.mygridview);

        //get list of product
        getProductList();

        gridView.setOnItemClickListener(onItemClick);
        stubGrid.setVisibility(View.VISIBLE);
        gridViewAdapter = new GridViewAdapter(getContext(), R.layout.grid_item, productList);
        gridView.setAdapter(gridViewAdapter);
        return rootView;
    }


    public List<Product> getProductList() {
        //pseudo code to get product, replace ur code to get real product here
        productList = new ArrayList<>();
        productList.add(new Product(R.drawable.blue, "Wedding", "Rp250000"));
        productList.add(new Product(R.drawable.gold, "Birthday", "Rp250000"));
        productList.add(new Product(R.drawable.green, "Cookies", "Rp250000"));
        productList.add(new Product(R.drawable.sea, "Bread", "Rp250000"));
        productList.add(new Product(R.drawable.soft, "Cupcakes", "Rp250000"));
        productList.add(new Product(R.drawable.blue, "Doughnut", "Rp250000"));
        productList.add(new Product(R.drawable.blue, "Wedding", "Rp250000"));
        productList.add(new Product(R.drawable.gold, "Birthday", "Rp250000"));
        productList.add(new Product(R.drawable.green, "Cookies", "Rp250000"));
        productList.add(new Product(R.drawable.sea, "Bread", "Rp250000"));
        productList.add(new Product(R.drawable.soft, "Cupcakes", "Rp250000"));
        productList.add(new Product(R.drawable.blue, "Doughnut", "Rp250000"));

        return productList;
    }

    AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getActivity(), KategoriActivity.class);
            startActivity(intent);
        }
    };
}