package com.example.latihanretrofitbuku

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanretrofitbuku.data.response.BukuItem
import com.example.latihanretrofitbuku.data.response.ListBukuResponse
import com.example.latihanretrofitbuku.data.retrofit.ApiConfig
import com.example.latihanretrofitbuku.databinding.ActivityMainBinding
import com.example.latihanretrofitbuku.ui.ListBukuAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object{
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvListBuku.layoutManager = layoutManager

        val itemDecoration = DividerItemDecoration(this, layoutManager.orientation)
        binding.rvListBuku.addItemDecoration(itemDecoration)

        findAllBuku()
    }

    private fun findAllBuku() {
        showLoading(true)

        val client =ApiConfig.getApiService().getAllBuku()
        client.enqueue(object : Callback<ListBukuResponse> {
            override fun onFailure(call: Call<ListBukuResponse>, t: Throwable) {
                showLoading(false)
                Log.e(TAG, "onFailure: ${t.message.toString()}")
            }

            override fun onResponse(
                call: Call<ListBukuResponse>,
                response: Response<ListBukuResponse>
            ) {
                showLoading(false)
                if (response.isSuccessful){
                    val responseBody = response.body()
                    if (responseBody != null){
                        setBukuData(responseBody.buku)
                    }
                }else{
                    Log.d(TAG, "onFailure: ${response.message()}")
                }
            }

        })
    }

    private fun setBukuData(dataBuku: List<BukuItem>) {
        val adapter = ListBukuAdapter()
        adapter.submitList(dataBuku)
        binding.rvListBuku.adapter = adapter
    }

    private fun showLoading(isLoading: Boolean) {
        if (isLoading){
            binding.progressBar.visibility = View.VISIBLE
        }else{
            binding.progressBar.visibility = View.GONE
        }
    }
}