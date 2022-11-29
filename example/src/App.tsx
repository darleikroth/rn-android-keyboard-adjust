import * as React from 'react';

import { StyleSheet, View, Text, TextInput } from 'react-native';
import { setAdjustResize, setAdjustNothing } from 'rn-android-keyboard-adjust';

export default function App() {
  const [value, setValue] = React.useState<string>('');

  React.useEffect(() => {
    setAdjustResize();
    return () => {
      setAdjustNothing();
    };
  }, []);

  return (
    <View style={styles.container}>
      <Text>Input with keyboard layout resize</Text>
      <TextInput
        style={styles.input}
        value={value}
        onChangeText={(text) => setValue(text)}
        placeholder="Type here"
        placeholderTextColor="#ccc"
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
  input: {
    padding: 8,
    borderWidth: 1,
    borderColor: '#ddd',
    width: '80%',
    margin: 8,
    borderRadius: 8,
  },
});
