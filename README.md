[![Release](https://jitpack.io/v/Servingo/MaterialColors.svg)](https://jitpack.io/#Servingo/MaterialColors)

# MaterialColors
Simple description...

### Preview

<img src="https://github.com/Servingo/MaterialColors/raw/master/preview/1.png" height="480" width="270" />
<img src="https://github.com/Servingo/MaterialColors/raw/master/preview/2.png" height="480" width="270" />
<img src="https://github.com/Servingo/MaterialColors/raw/master/preview/3.png" height="480" width="270" />

### Simple usage

```java
public class BaseActivity extends AppCompatActivity {
    protected static MaterialColor primary = MaterialColor.from(RGB.from(33, 33, 33));

    protected static MaterialColor primaryDark = MaterialColor.from(RGB.from(0, 0, 0));

    protected static MaterialColor accent = MaterialColor.from(RGB.from(177, 33, 33));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MaterialThemeStyler.applyPrimaryColor(this, primary);
        MaterialThemeStyler.applyPrimaryDarkColor(this, primaryDark);
        MaterialThemeStyler.applyAccentColor(this, accent);

        super.onCreate(savedInstanceState);
    }
}
```

### How to add
####Step 1. Add the JitPack repository in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}

####Step 2. Add the dependency to your app dependencies

	dependencies {
		compile 'com.github.servingo:materialcolors:1.0.0'
	}

