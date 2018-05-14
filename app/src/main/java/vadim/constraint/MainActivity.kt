package vadim.constraint

import android.os.Bundle
import android.support.design.bottomappbar.BottomAppBar
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_appbar.replaceMenu(R.menu.bottom_appbar_menu)
        btChudo.setOnClickListener {
            bottom_appbar.toggleAlignment()
        }

        ago.setOnCloseIconClickListener { Snackbar.make(root, "Ухади", Snackbar.LENGTH_SHORT).show() }
        viseven.setOnCloseIconClickListener { Toast.makeText(this, "Close Viseven!", Toast.LENGTH_SHORT).show() }
    }

    fun BottomAppBar.toggleAlignment() {
        val current = fabAlignmentMode
        fabAlignmentMode = current.xor(1)
    }
}
