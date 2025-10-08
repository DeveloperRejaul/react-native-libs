import { useEffect } from 'react';
import { Text, View, StyleSheet} from 'react-native';
import { setStatusBarColor, setNavigationBarColor } from 'react-native-libs';


export default function App() {
  useEffect(()=>{
    setNavigationBarColor('#FFFFFF', false);
    setStatusBarColor('#a20d0d', true);
  },[])
  return (
    <View style={styles.container}>
      <Text>Result: {"result"}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
