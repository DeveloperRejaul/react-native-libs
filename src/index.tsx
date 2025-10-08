import Libs from './NativeLibs';

export function setStatusBarColor(colorHex: string, darkIcons: boolean) {
  Libs.setStatusBarColor(colorHex, darkIcons);
}

export function setNavigationBarColor(colorHex: string, darkIcons: boolean) {
  Libs.setNavigationBarColor(colorHex, darkIcons);
}
