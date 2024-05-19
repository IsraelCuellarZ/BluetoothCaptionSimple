package com.example.bluetoothcaptionsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.UUID
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.bluetooth.BluetoothSocket
import android.widget.ArrayAdapter

const val REQUEST_ENBLE_BT = 777

class MainActivity : AppCompatActivity() {
    //class ExampleFragment : Fragment(R.layout.example_fragment)
    private lateinit var mBTAdapter: BluetoothAdapter
    private var mAddressDevices: ArrayAdapter<String>? = null
    private var mNameDevices: ArrayAdapter<String>? = null

    companion object{
        var m_myUUID:UUID = UUID.fromString("00001101-0000-1000-00805F9B334FB") ///***
        private var m_bluetoothSocket: BluetoothSocket?= null
        private var m_isConected: Boolean = false
        lateinit var  m_address: String
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}