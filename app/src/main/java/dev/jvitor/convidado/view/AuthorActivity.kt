package dev.jvitor.convidado.view

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import dev.jvitor.convidado.R
import dev.jvitor.convidado.databinding.ActivityAuthorBinding

class AuthorActivity : AppCompatActivity() , View.OnClickListener{

    private lateinit var binding: ActivityAuthorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageviewGithubLink.setOnClickListener(this)
        binding.imageviewLinkedinLink.setOnClickListener(this)

    }
    // view: View
    private fun openGitHubPage() {
        val githubUrl = getString(R.string.github_url)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl))
        startActivity(intent)
    }

    private fun openLinkedinPage() {
        val githubUrl = getString(R.string.linkedin_url)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl))
        startActivity(intent)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.imageviewGithubLink)
            openGitHubPage()
        else if (v.id == R.id.imageviewLinkedinLink)
            openLinkedinPage()
    }
}