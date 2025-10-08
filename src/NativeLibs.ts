import { TurboModuleRegistry, type TurboModule } from 'react-native';

export interface Spec extends TurboModule {
  setStatusBarColor(color: string, darkIcons: boolean): void;
  setNavigationBarColor(color: string, darkIcons: boolean): void;
}

export default TurboModuleRegistry.getEnforcing<Spec>('Libs');
