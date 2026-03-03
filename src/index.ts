import { Platform } from 'react-native';
import Libs from './NativeLibs';

export function setStatusBarColor(colorHex: string, darkIcons: boolean) {
  if(Platform.OS === 'android' ){
    Libs.setStatusBarColor(colorHex, darkIcons);
  }
  
}

export function setNavigationBarColor(colorHex: string, darkIcons: boolean) {
  if(Platform.OS === 'android' ){
    Libs.setNavigationBarColor(colorHex, darkIcons);
  }
}