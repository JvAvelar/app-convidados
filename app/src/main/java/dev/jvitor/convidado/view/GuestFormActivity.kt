package dev.jvitor.convidado.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import dev.jvitor.convidado.databinding.ActivityGuestFormBinding
import dev.jvitor.convidado.model.DataBaseConstants
import dev.jvitor.convidado.model.GuestModel
import dev.jvitor.convidado.viewmodel.GuestFormViewModel

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityGuestFormBinding
    private lateinit var viewModel: GuestFormViewModel

    private var guestId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[GuestFormViewModel::class.java]

        binding.btnSave.setOnClickListener(this)
        binding.radiobtnPresent.isChecked = true


        loadData()
        observe()

    }

    override fun onClick(v: View) {
        if (v.id == binding.btnSave.id) {
            val name = binding.editextName.text.toString()
            val presence = binding.radiobtnPresent.isChecked
            val model = GuestModel().apply {
                this.id = guestId
                this.name = name
                this.presence = presence
            }
            viewModel.save(model)

        }
    }

    private fun loadData() {
        val bundle = intent.extras
        if (bundle != null) {
            guestId = bundle.getInt(DataBaseConstants.GUEST_ID)
            viewModel.get(guestId)
        }
    }

    private fun observe() {
        viewModel.guest.observe(this) {
                binding.editextName.setText(it.name)
                if (it.presence)
                    binding.radiobtnPresent.isChecked = true
                else
                    binding.radiobtnAbsent.isChecked = true
            }

        viewModel.saveGuest.observe(this) {
            if (it.isNotBlank()) {
                Toast.makeText(applicationContext, it, Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}