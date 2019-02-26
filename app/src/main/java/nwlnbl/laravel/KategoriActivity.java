package nwlnbl.laravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class KategoriActivity extends AppCompatActivity {
    private ViewStub stubGrid;
    private GridView gridView;
    private GridViewAdapter gridViewAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        stubGrid = (ViewStub) findViewById(R.id.stub_grid2);
        stubGrid.inflate();
        gridView = (GridView) findViewById(R.id.mygridview);

        //get list of product
        getProductList();

        gridView.setOnItemClickListener(onItemClick);
        stubGrid.setVisibility(View.VISIBLE);
        gridViewAdapter = new GridViewAdapter(this, R.layout.grid_item, productList);
        gridView.setAdapter(gridViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.cart) {
            Intent intent = new Intent(this, Cart.class);
            startActivity(intent);
        }
        if (id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
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
            Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
            startActivity(intent);
        }
    };
}

