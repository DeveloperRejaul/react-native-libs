# react-native-libs

A simple React Native native module to control the **Status Bar** and **Navigation Bar** colors on Android.

## Installation

```bash
npm install react-native-libs
```

or

```bash
yarn add react-native-libs
```

---


## Usage

```javascript
import { setStatusBarColor, setNavigationBarColor } from 'react-native-libs';

// Change Status Bar color
setStatusBarColor('#1E90FF', true);

// Change Navigation Bar color
setNavigationBarColor('#FFFFFF', false);
```

---

## API

### `setStatusBarColor(color: string, lightIcons: boolean): void`

Sets the Android status bar color.

| Parameter    | Type    | Description                                    |
| ------------ | ------- | ---------------------------------------------- |
| `color`      | string  | Hex color value (e.g. `#FFFFFF`)               |
| `lightIcons` | boolean | `true` for light icons, `false` for dark icons |

Example:

```javascript
setStatusBarColor('#000000', true);
```

---

### `setNavigationBarColor(color: string, lightIcons: boolean): void`

Sets the Android navigation bar color.

| Parameter    | Type    | Description                                    |
| ------------ | ------- | ---------------------------------------------- |
| `color`      | string  | Hex color value (e.g. `#FFFFFF`)               |
| `lightIcons` | boolean | `true` for light icons, `false` for dark icons |

Example:

```javascript
setNavigationBarColor('#FFFFFF', false);
```

---

## Platform Support

| Platform | Supported |
| -------- | --------- |
| Android  | Yes     |
| iOS      | No      |

---

## Notes

* This library works on **Android only**.
* Make sure your app theme does not override system bar colors.
* Some older Android versions may have limited support for icon color changes.

---

## Contributing

Pull requests are welcome! Feel free to open an issue if you find a bug or want to suggest a feature.

---

## License

MIT License
