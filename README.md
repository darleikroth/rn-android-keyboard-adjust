## rn-android-keyboard-adjust

[![npm][npm]][npm-url]
[![size][size]][size-url]

Simple android native module to manipulate the behavior of keyboard. Based on [react-native-android-keyboard-adjust](https://github.com/zubricky/react-native-android-keyboard-adjust) by [Marc Zubricky](https://github.com/zubricky).

### Install

```
npm i --save rn-android-keyboard-adjust
```
```
react-native link rn-android-keyboard-adjust
```

### Usage

```js
import RNAndroidKeyboardAdjust from 'rn-android-keyboard-adjust'

class Sample extends React.Component {

  componentDidMount() {
    RNAndroidKeyboardAdjust.setAdjustNothing()
  }
}
```

### Methods

Name | Description
--- | ---
setAdjustNothing | Set to have a window not adjust for a shown input method. The window will not be resized, and it will not be panned to make its focus visible.
setAdjustPan | Set to have a window pan when an input method is shown, so it doesn't need to deal with resizing but just panned by the framework to ensure the current input focus is visible.
setAdjustResize | Set to allow the window to be resized when an input method is shown, so that its contents are not covered by the input method.
setAdjustUnspecified | Nothing specified. The system will try to pick one or the other depending on the contents of the window.
setAlwaysHidden | Please always hide any soft input area when this window receives focus.
setAlwaysVisible | Please always make the soft input area visible when this window receives input focus.
setVisible | Please show the soft input area when normally appropriate (when the user is navigating forward to your window).
setHidden | Please hide any soft input area when normally appropriate (when the user is navigating forward to your window).
setUnchanged | Please don't change the state of the soft input area.
> Methods reference from [Android Developer](https://developer.android.com/reference/android/view/WindowManager.LayoutParams#SOFT_INPUT_ADJUST_NOTHING).

[npm]: https://badge.fury.io/js/rn-android-keyboard-adjust.svg
[npm-url]: https://npmjs.com/package/rn-android-keyboard-adjust

[size]: https://packagephobia.now.sh/badge?p=rn-android-keyboard-adjust
[size-url]: https://packagephobia.now.sh/result?p=rn-android-keyboard-adjust
