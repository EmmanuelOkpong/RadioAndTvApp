package com.example.abntvpassio945fm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnboardingItemsAdapter(private val onboardingItems: List<OnboardingItem>):
RecyclerView.Adapter<OnboardingItemsAdapter.onboardingItemViewHolder>(){

    inner class onboardingItemViewHolder(view: View):RecyclerView.ViewHolder(view){
        private val imageOnboarding= view.findViewById<ImageView>(R.id.imageOnboarding)
        private val textOnboarding= view.findViewById<TextView>(R.id.OnBoardText)

   fun bind(onboardingItem:OnboardingItem){
       imageOnboarding.setImageResource(onboardingItem.onboardingIamge)
       textOnboarding.text=onboardingItem.onboardingText
    }

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): onboardingItemViewHolder {
        return onboardingItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.onboardingitem,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return onboardingItems.size
    }

    override fun onBindViewHolder(holder: onboardingItemViewHolder, position: Int) {
        holder.bind(onboardingItems[position])
    }

}