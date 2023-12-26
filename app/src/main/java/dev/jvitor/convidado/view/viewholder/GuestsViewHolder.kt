package dev.jvitor.convidado.view.viewholder


import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import dev.jvitor.convidado.databinding.RowGuestBinding
import dev.jvitor.convidado.model.GuestModel
import dev.jvitor.convidado.view.listener.OnGuestListener

class GuestsViewHolder(private val bind: RowGuestBinding, private val listener: OnGuestListener) :
    RecyclerView.ViewHolder(bind.root) {

    fun bind(guest: GuestModel) {
        bind.textName.text = guest.name

        bind.textName.setOnClickListener {
            listener.onClick(guest.id)
        }

        bind.textName.setOnLongClickListener {
            AlertDialog.Builder(itemView.context)
                .setTitle("Remoção de convidado")
                .setMessage("Tem certeza que deseja remover ${guest.name}?")
                .setPositiveButton("Sim") { dialog, which -> listener.onDelete(guest.id) }
                .setNegativeButton("Não", null)
                .create()
                .show()
            true
        }

    }
}