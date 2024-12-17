package me.phh.treble.app

import android.service.quicksettings.TileService

object MSPenCharger {
    init {
        System.loadLibrary("ms_pen_charger")
    }

    @JvmStatic
    external fun turnOnPenCharger(): Int

    @JvmStatic
    external fun turnOffPenCharger(): Int

    @JvmStatic
    external fun readPenCharger(): Int
}

class MsPENTileService: TileService() {

    // Called when the user adds your tile.
    override fun onTileAdded() {
      super.onTileAdded()
    }
    // Called when your app can update your tile.
    override fun onStartListening() {
      super.onStartListening()
    }
  
    // Called when your app can no longer update your tile.
    override fun onStopListening() {
      super.onStopListening()
    }
  
    // Called when the user taps on your tile in an active or inactive state.
    override fun onClick() {
      super.onClick()
    }
    // Called when the user removes your tile.
    override fun onTileRemoved() {
      super.onTileRemoved()
    }
  }