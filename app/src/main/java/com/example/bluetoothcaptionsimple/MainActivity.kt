package com.example.bluetoothcaptionsimple

import android.app.Activity
import android.app.ActivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.UUID
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.bluetooth.BluetoothSocket
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.bluetoothcaptionsimple.databinding.ActivityMainBinding

const val REQUEST_ENBLE_BT = 777

class MainActivity : AppCompatActivity() {
    //class ExampleFragment : Fragment(R.layout.example_fragment)
    private lateinit var mBTAdapter: BluetoothAdapter
    private var mAddressDevices: ArrayAdapter<String>? = null
    private var mNameDevices: ArrayAdapter<String>? = null

    companion object{
        var m_myUUID:UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB") ///***
        private var m_bluetoothSocket: BluetoothSocket?= null
        private var m_isConected: Boolean = false
        lateinit var  m_address: String
    }

    private lateinit var k_binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        k_binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(k_binding.root)
        setSupportActionBar(k_binding.toolbarB)






    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menutoolbar, menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item_Conect , R.id.item_Conect_indicator -> {
                Toast.makeText(this, "Coenctar", Toast.LENGTH_SHORT).show()
                //TODO ///cambio de icono a azul y a rojo cuando este descoencte
            }
            R.id.item_closed_app -> Toast.makeText(this, "Cerrar aplicacion", Toast.LENGTH_SHORT).show()

        }
        return super.onOptionsItemSelected(item)
    }


}