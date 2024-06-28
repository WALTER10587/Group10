package com.example.product;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AddProducts extends AppCompatActivity {
    TextView addProduct,viewProduct,editProduct, deleteProduct;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_products);

        addProduct = findViewById(R.id.addproduct);
        viewProduct = findViewById(R.id.viewproduct);
        editProduct = findViewById(R.id.editproduct);
        deleteProduct = findViewById(R.id.deleteproduct);


//        addProduct.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View addProduct) {
//                Toast.makeText(getApplicationContext(),"I have been clicked",Toast.LENGTH_LONG).show();
//            }
//        });
        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AddProductActivity.class));
            }
        });
//
//        viewProduct.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View viewProduct) {
//                Toast.makeText(getApplicationContext(),"I have been clicked",Toast.LENGTH_LONG).show();
//            }
//        });
        viewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ViewProductActivity.class));
            }
        });


//        editProduct.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View editProduct) {
//                Toast.makeText(getApplicationContext(),"I have been clicked",Toast.LENGTH_LONG).show();
//            }
//        });
        editProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), EditProductActivity.class));
            }
        });

//        deleteProduct.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View deleteProduct) {
//                Toast.makeText(getApplicationContext(),"I have been clicked",Toast.LENGTH_LONG).show();
//            }
//        });
        deleteProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DeleteProductActivity.class));
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}