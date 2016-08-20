[![Release](https://jitpack.io/v/Servingo/MaterialColors.svg)](https://jitpack.io/#Servingo/MaterialColors)

# MaterialColors

MaterialColors is a small library to help with styling Android apps based on the Material theme at runtime. It is able to work around the limitation of fixed styles defined via hardcoded XML files. Furthermore it is able to adjust any color to become a [MaterialColor](https://material.google.com/style/color.html#color-color-palette) as defined by Google.

### Preview

<img src="https://github.com/Servingo/MaterialColors/raw/master/preview/1.png" height="480" width="270" />
<img src="https://github.com/Servingo/MaterialColors/raw/master/preview/2.png" height="480" width="270" />
<img src="https://github.com/Servingo/MaterialColors/raw/master/preview/3.png" height="480" width="270" />

### Working with MaterialColors

```java
MaterialColor primary = MaterialColor.from(MaterialColorHue.BLUE, MaterialColorShade.P500);
MaterialColor primaryDark = MaterialColor.from(MaterialColorHue.BLUE, MaterialColorShade.P700);
MaterialColor accent = MaterialColor.from(MaterialColorHue.RED, MaterialColorShade.A400)

MaterialColorHue.values() // Holds all hues
MaterialColorHue.primaries() // Holds only hues which can be used as primary colors
MaterialColorHue.accents() // Holds only hues which can be used as accent colors

MaterialColorShade.values() // Holds all shades
MaterialColorShade.primaries() // Holds only primary shades
MaterialColorShade.accents() // Holds only accent shades
```

### Changing a Material theme

It is necessary to change the theme of an activity right after the creation of the activity.

```java
public class BaseActivity extends AppCompatActivity {

    public static MaterialColor primary = MaterialColor.from(RGB.from(33, 33, 33));
    public static MaterialColor primaryDark = MaterialColor.from(RGB.from(0, 0, 0));
    public static MaterialColor accent = MaterialColor.from(RGB.from(177, 33, 33));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MaterialThemeStyler.applyPrimaryColor(this, primary);
        MaterialThemeStyler.applyPrimaryDarkColor(this, primaryDark);
        MaterialThemeStyler.applyAccentColor(this, accent);

        super.onCreate(savedInstanceState);
    }
    
}
```

The following snippet shows how to change the colors at runtime. It is necessary to recreate the activity to apply the changes, in case the activity is already running.

```java
public class MainActivity extends BaseActivity {

    public void randomizeTheme() {
        Random random = new Random();
    
        MaterialColorHue primaryHue = MaterialColorHue.primaries()[random.nextInt(MaterialColorHue.primaries().length)];
        BaseActivity.primary = MaterialColor.from(primaryHue, MaterialColorShade.P500);
        BaseActivity.primaryDark = MaterialColor.from(primaryHue, MaterialColorShade.P700);
    
        MaterialColorHue accentHue = MaterialColorHue.accents()[random.nextInt(MaterialColorHue.accents().length)];
        MaterialColorShade accentShade = MaterialColorShade.accents()[random.nextInt(MaterialColorShade.accents().length)];
        BaseActivity.accent = MaterialColor.from(accentHue, accentShade);
    
        recreate();
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
		compile 'com.github.servingo:materialcolors:1.0.0@aar'
	}

### How it works

You don't want to know. Just assume it's magic!