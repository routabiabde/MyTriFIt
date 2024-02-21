package com.example.mytrifit.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mytrifit.R
import com.example.mytrifit.model.allDataApp
import com.example.mytrifit.model.product.CoursProduct
import com.example.mytrifit.model.product.Product
import com.example.mytrifit.model.product.foodCompliment

class DetailsProductAdapter(private val context: Context, private var productList: List<Product>) :
    RecyclerView.Adapter<DetailsProductAdapter.ProductViewHolder>() {

    fun setList(productList: List<Product>){
        this.productList = productList
        notifyDataSetChanged()
    }

    // ViewHolder class to hold the views
    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val iconProduct:ImageView = itemView.findViewById(R.id.productIcon)
        val productName: TextView = itemView.findViewById(R.id.nameProdcut)
        val productPrice: TextView = itemView.findViewById(R.id.priceProduct)
        val productProductAfterRemis: TextView = itemView.findViewById(R.id.priceAfterRemise)
        val btnAdd:ImageButton = itemView.findViewById(R.id.addToCard)

        // Add more views as needed for additional product details
    }

    // Inflate the layout and create the ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.foodcompliment_view, parent, false)
        return ProductViewHolder(view)
    }

    // Bind data to the views
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]

        holder.productName.text = product.nomprod
        holder.productPrice.text = "${product.priceProduct}"
        holder.productProductAfterRemis.text = "Discount ${product.getProductWithRemis()}"
        holder.iconProduct.setImageResource(product.icon)

        holder.btnAdd.setOnClickListener {


                allDataApp.cartList1.add(product)


        }
    }

    // Return the total number of items in the list
    override fun getItemCount(): Int {
        return productList.size
    }
}
