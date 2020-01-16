package com.azp.furnitureshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.azp.furnitureshop.adapter.CategoryAdapter
import com.azp.furnitureshop.adapter.FurnitureAdapter
import com.azp.furnitureshop.model.Category
import com.azp.furnitureshop.model.Furniture

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryView()

        trendingView()

        bestSellingView()
    }

    fun categoryView(){
        var categoryRecyclerView :RecyclerView = findViewById(R.id.recycler_discover)

        var categoryList = ArrayList<Category>()
        categoryList.add(Category("Chairs",2122, R.drawable.chair))
        categoryList.add(Category("Tables",322,R.drawable.table))
        categoryList.add(Category("Sofa",43, R.drawable.sofa))

        var categoryAdapter = CategoryAdapter(categoryList)

        categoryRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        categoryRecyclerView.adapter = categoryAdapter
    }

    fun trendingView(){
        var recyclerTrending:RecyclerView = findViewById(R.id.recycler_trending)

        var furnitureList = ArrayList<Furniture>()
        furnitureList.add(Furniture("Ivonne chair, green",29.00, R.drawable.chair))
        furnitureList.add(Furniture("Snakeshin Pattern buckle", 29.00, R.drawable.chair))
        furnitureList.add(Furniture("Armchair Konna green", 29.00, R.drawable.chair))

        var trendingAdapter = FurnitureAdapter(furnitureList)

        recyclerTrending.layoutManager = LinearLayoutManager(this)

        recyclerTrending.adapter = trendingAdapter
    }

    fun bestSellingView(){
        var bestSellingRecycler: RecyclerView = findViewById(R.id.recycler_best_selling)

        var bestSellingList = ArrayList<Furniture>()
        bestSellingList.add(Furniture("Ruffle Trim Spot Wrap Dress", 29.00, R.drawable.sofa))
        bestSellingList.add(Furniture("Leaf Floral Print Random", 29.00, R.drawable.chair))
        bestSellingList.add(Furniture("Drop Shoulder Geo Pattern", 29.00, R.drawable.chair))

        var bestSellingAdapter = FurnitureAdapter(bestSellingList)

        bestSellingRecycler.layoutManager = LinearLayoutManager(this)

        bestSellingRecycler.adapter = bestSellingAdapter
    }

}
