import { NativeModules, Platform } from 'react-native';
const android = Platform.OS === 'android';

const LINKING_ERROR =
  `The package 'rn-android-keyboard-adjust' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

const RnAndroidKeyboardAdjust = NativeModules.RnAndroidKeyboardAdjust
  ? NativeModules.RnAndroidKeyboardAdjust
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export function setAdjustNothing() {
  if (android) {
    RnAndroidKeyboardAdjust.setAdjustNothing();
  }
}

export function setAdjustPan() {
  if (android) {
    RnAndroidKeyboardAdjust.setAdjustPan();
  }
}

export function setAdjustResize() {
  if (android) {
    RnAndroidKeyboardAdjust.setAdjustResize();
  }
}

export function setAdjustUnspecified() {
  if (android) {
    RnAndroidKeyboardAdjust.setAdjustUnspecified();
  }
}

export function setAlwaysHidden() {
  if (android) {
    RnAndroidKeyboardAdjust.setAlwaysHidden();
  }
}

export function setAlwaysVisible() {
  if (android) {
    RnAndroidKeyboardAdjust.setAlwaysVisible();
  }
}

export function setVisible() {
  if (android) {
    RnAndroidKeyboardAdjust.setVisible();
  }
}

export function setHidden() {
  if (android) {
    RnAndroidKeyboardAdjust.setHidden();
  }
}

export function setUnchanged() {
  if (android) {
    RnAndroidKeyboardAdjust.setUnchanged();
  }
}

export function getSoftInputMode(
  getter: (softInputMode: number) => void
): void {
  if (android) {
    RnAndroidKeyboardAdjust.getSoftInputMode(getter);
  }
}

export function setSoftInputMode(softInputMode: number): void {
  if (android) {
    RnAndroidKeyboardAdjust.setSoftInputMode(softInputMode);
  }
}

export default {
  setAdjustNothing,
  setAdjustPan,
  setAdjustResize,
  setAdjustUnspecified,
  setAlwaysHidden,
  setAlwaysVisible,
  setVisible,
  setHidden,
  setUnchanged,
  getSoftInputMode,
  setSoftInputMode,
};
