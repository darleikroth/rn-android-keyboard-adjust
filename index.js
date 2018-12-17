import { NativeModules, Platform } from 'react-native'
const RNAndroidKeyboardAdjust = NativeModules.RNAndroidKeyboardAdjust
const android = Platform.OS === 'android'

export default {
  setAdjustNothing() {
    if (android) {
      RNAndroidKeyboardAdjust.setAdjustNothing()
    }
  },

  setAdjustPan() {
    if (android) {
      RNAndroidKeyboardAdjust.setAdjustPan()
    }
  },

  setAdjustResize() {
    if (android) {
      RNAndroidKeyboardAdjust.setAdjustResize()
    }
  },

  setAdjustUnspecified() {
    if (android) {
      RNAndroidKeyboardAdjust.setAdjustUnspecified()
    }
  },

  setAlwaysVisible() {
    if (android) {
      RNAndroidKeyboardAdjust.setAlwaysVisible()
    }
  },

  setAlwaysHidden() {
    if (android) {
      RNAndroidKeyboardAdjust.setAlwaysHidden()
    }
  },

  setVisible() {
    if (android) {
      RNAndroidKeyboardAdjust.setVisible()
    }
  },

  setHidden() {
    if (android) {
      RNAndroidKeyboardAdjust.setHidden()
    }
  },

  setUnchanged() {
    if (android) {
      RNAndroidKeyboardAdjust.setUnchanged()
    }
  }
}
