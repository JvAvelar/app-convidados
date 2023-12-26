package dev.jvitor.convidado.view.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.jvitor.convidado.databinding.RowGuestBinding
import dev.jvitor.convidado.model.GuestModel
import dev.jvitor.convidado.view.listener.OnGuestListener
import dev.jvitor.convidado.view.viewholder.GuestsViewHolder

class GuestsAdapter : RecyclerView.Adapter<GuestsViewHolder>(){

    private var guestList: List<GuestModel> = listOf()
    private lateinit var listener: OnGuestListener
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuestsViewHolder {
        val item = RowGuestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GuestsViewHolder(item, listener)
    }

    override fun onBindViewHolder(holder: GuestsViewHolder, position: Int) {
        holder.bind(guestList[position])

    }

    override fun getItemCount(): Int {
        return guestList.count()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateGuests(list: List<GuestModel>){
        guestList = list
        notifyDataSetChanged()
    }

    fun attachListener(guestListener: OnGuestListener){
        listener = guestListener

    }
}