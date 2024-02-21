package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidLibraryAccessors laccForAndroidLibraryAccessors = new AndroidLibraryAccessors(owner);
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final DebuggingLibraryAccessors laccForDebuggingLibraryAccessors = new DebuggingLibraryAccessors(owner);
    private final GoogleLibraryAccessors laccForGoogleLibraryAccessors = new GoogleLibraryAccessors(owner);
    private final JetbrainsLibraryAccessors laccForJetbrainsLibraryAccessors = new JetbrainsLibraryAccessors(owner);
    private final JunitLibraryAccessors laccForJunitLibraryAccessors = new JunitLibraryAccessors(owner);
    private final LottieLibraryAccessors laccForLottieLibraryAccessors = new LottieLibraryAccessors(owner);
    private final SquareupLibraryAccessors laccForSquareupLibraryAccessors = new SquareupLibraryAccessors(owner);
    private final TestLibraryAccessors laccForTestLibraryAccessors = new TestLibraryAccessors(owner);
    private final WisnuLibraryAccessors laccForWisnuLibraryAccessors = new WisnuLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Returns the group of libraries at android
     */
    public AndroidLibraryAccessors getAndroid() {
        return laccForAndroidLibraryAccessors;
    }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at debugging
     */
    public DebuggingLibraryAccessors getDebugging() {
        return laccForDebuggingLibraryAccessors;
    }

    /**
     * Returns the group of libraries at google
     */
    public GoogleLibraryAccessors getGoogle() {
        return laccForGoogleLibraryAccessors;
    }

    /**
     * Returns the group of libraries at jetbrains
     */
    public JetbrainsLibraryAccessors getJetbrains() {
        return laccForJetbrainsLibraryAccessors;
    }

    /**
     * Returns the group of libraries at junit
     */
    public JunitLibraryAccessors getJunit() {
        return laccForJunitLibraryAccessors;
    }

    /**
     * Returns the group of libraries at lottie
     */
    public LottieLibraryAccessors getLottie() {
        return laccForLottieLibraryAccessors;
    }

    /**
     * Returns the group of libraries at squareup
     */
    public SquareupLibraryAccessors getSquareup() {
        return laccForSquareupLibraryAccessors;
    }

    /**
     * Returns the group of libraries at test
     */
    public TestLibraryAccessors getTest() {
        return laccForTestLibraryAccessors;
    }

    /**
     * Returns the group of libraries at wisnu
     */
    public WisnuLibraryAccessors getWisnu() {
        return laccForWisnuLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AndroidLibraryAccessors extends SubDependencyFactory {

        public AndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for desugarJdkLibs (com.android.tools:desugar_jdk_libs)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDesugarJdkLibs() {
                return create("android.desugarJdkLibs");
        }

            /**
             * Creates a dependency provider for gradlePlugin (com.android.tools.build:gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradlePlugin() {
                return create("android.gradlePlugin");
        }

    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxActivityLibraryAccessors laccForAndroidxActivityLibraryAccessors = new AndroidxActivityLibraryAccessors(owner);
        private final AndroidxBenchmarkLibraryAccessors laccForAndroidxBenchmarkLibraryAccessors = new AndroidxBenchmarkLibraryAccessors(owner);
        private final AndroidxComposeLibraryAccessors laccForAndroidxComposeLibraryAccessors = new AndroidxComposeLibraryAccessors(owner);
        private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);
        private final AndroidxDataStoreLibraryAccessors laccForAndroidxDataStoreLibraryAccessors = new AndroidxDataStoreLibraryAccessors(owner);
        private final AndroidxHiltLibraryAccessors laccForAndroidxHiltLibraryAccessors = new AndroidxHiltLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
        private final AndroidxNavigationLibraryAccessors laccForAndroidxNavigationLibraryAccessors = new AndroidxNavigationLibraryAccessors(owner);
        private final AndroidxRoomLibraryAccessors laccForAndroidxRoomLibraryAccessors = new AndroidxRoomLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() {
                return create("androidx.appcompat");
        }

            /**
             * Creates a dependency provider for profileinstaller (androidx.profileinstaller:profileinstaller)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getProfileinstaller() {
                return create("androidx.profileinstaller");
        }

            /**
             * Creates a dependency provider for startup (androidx.startup:startup-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getStartup() {
                return create("androidx.startup");
        }

            /**
             * Creates a dependency provider for window (androidx.window:window)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getWindow() {
                return create("androidx.window");
        }

        /**
         * Returns the group of libraries at androidx.activity
         */
        public AndroidxActivityLibraryAccessors getActivity() {
            return laccForAndroidxActivityLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.benchmark
         */
        public AndroidxBenchmarkLibraryAccessors getBenchmark() {
            return laccForAndroidxBenchmarkLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.compose
         */
        public AndroidxComposeLibraryAccessors getCompose() {
            return laccForAndroidxComposeLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.core
         */
        public AndroidxCoreLibraryAccessors getCore() {
            return laccForAndroidxCoreLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.dataStore
         */
        public AndroidxDataStoreLibraryAccessors getDataStore() {
            return laccForAndroidxDataStoreLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.hilt
         */
        public AndroidxHiltLibraryAccessors getHilt() {
            return laccForAndroidxHiltLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.lifecycle
         */
        public AndroidxLifecycleLibraryAccessors getLifecycle() {
            return laccForAndroidxLifecycleLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.navigation
         */
        public AndroidxNavigationLibraryAccessors getNavigation() {
            return laccForAndroidxNavigationLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.room
         */
        public AndroidxRoomLibraryAccessors getRoom() {
            return laccForAndroidxRoomLibraryAccessors;
        }

    }

    public static class AndroidxActivityLibraryAccessors extends SubDependencyFactory {

        public AndroidxActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.activity:activity-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("androidx.activity.compose");
        }

    }

    public static class AndroidxBenchmarkLibraryAccessors extends SubDependencyFactory {

        public AndroidxBenchmarkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for macro (androidx.benchmark:benchmark-macro-junit4)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMacro() {
                return create("androidx.benchmark.macro");
        }

    }

    public static class AndroidxComposeLibraryAccessors extends SubDependencyFactory {
        private final AndroidxComposeMaterialLibraryAccessors laccForAndroidxComposeMaterialLibraryAccessors = new AndroidxComposeMaterialLibraryAccessors(owner);

        public AndroidxComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for foundation (androidx.compose.foundation:foundation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFoundation() {
                return create("androidx.compose.foundation");
        }

            /**
             * Creates a dependency provider for material3 (androidx.compose.material3:material3)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial3() {
                return create("androidx.compose.material3");
        }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUi() {
                return create("androidx.compose.ui");
        }

            /**
             * Creates a dependency provider for widget (androidx.glance:glance)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getWidget() {
                return create("androidx.compose.widget");
        }

        /**
         * Returns the group of libraries at androidx.compose.material
         */
        public AndroidxComposeMaterialLibraryAccessors getMaterial() {
            return laccForAndroidxComposeMaterialLibraryAccessors;
        }

    }

    public static class AndroidxComposeMaterialLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxComposeMaterialLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for material (androidx.compose.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("androidx.compose.material");
        }

            /**
             * Creates a dependency provider for iconsCore (androidx.compose.material:material-icons-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIconsCore() {
                return create("androidx.compose.material.iconsCore");
        }

            /**
             * Creates a dependency provider for iconsExtended (androidx.compose.material:material-icons-extended)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIconsExtended() {
                return create("androidx.compose.material.iconsExtended");
        }

    }

    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.core:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.core.ktx");
        }

    }

    public static class AndroidxDataStoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxDataStoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.datastore:datastore)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("androidx.dataStore.core");
        }

    }

    public static class AndroidxHiltLibraryAccessors extends SubDependencyFactory {
        private final AndroidxHiltNavigationLibraryAccessors laccForAndroidxHiltNavigationLibraryAccessors = new AndroidxHiltNavigationLibraryAccessors(owner);

        public AndroidxHiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.hilt.navigation
         */
        public AndroidxHiltNavigationLibraryAccessors getNavigation() {
            return laccForAndroidxHiltNavigationLibraryAccessors;
        }

    }

    public static class AndroidxHiltNavigationLibraryAccessors extends SubDependencyFactory {

        public AndroidxHiltNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.hilt:hilt-navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("androidx.hilt.navigation.compose");
        }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtimeCompose (androidx.lifecycle:lifecycle-runtime-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntimeCompose() {
                return create("androidx.lifecycle.runtimeCompose");
        }

            /**
             * Creates a dependency provider for viewModelCompose (androidx.lifecycle:lifecycle-viewmodel-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewModelCompose() {
                return create("androidx.lifecycle.viewModelCompose");
        }

    }

    public static class AndroidxNavigationLibraryAccessors extends SubDependencyFactory {

        public AndroidxNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.navigation:navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("androidx.navigation.compose");
        }

    }

    public static class AndroidxRoomLibraryAccessors extends SubDependencyFactory {

        public AndroidxRoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("androidx.room.compiler");
        }

            /**
             * Creates a dependency provider for ktx (androidx.room:room-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.room.ktx");
        }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("androidx.room.runtime");
        }

    }

    public static class DebuggingLibraryAccessors extends SubDependencyFactory {
        private final DebuggingComposeLibraryAccessors laccForDebuggingComposeLibraryAccessors = new DebuggingComposeLibraryAccessors(owner);
        private final DebuggingOkhttpLibraryAccessors laccForDebuggingOkhttpLibraryAccessors = new DebuggingOkhttpLibraryAccessors(owner);

        public DebuggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for chucker (com.github.chuckerteam.chucker:library)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getChucker() {
                return create("debugging.chucker");
        }

        /**
         * Returns the group of libraries at debugging.compose
         */
        public DebuggingComposeLibraryAccessors getCompose() {
            return laccForDebuggingComposeLibraryAccessors;
        }

        /**
         * Returns the group of libraries at debugging.okhttp
         */
        public DebuggingOkhttpLibraryAccessors getOkhttp() {
            return laccForDebuggingOkhttpLibraryAccessors;
        }

    }

    public static class DebuggingComposeLibraryAccessors extends SubDependencyFactory {

        public DebuggingComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for uiTooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUiTooling() {
                return create("debugging.compose.uiTooling");
        }

    }

    public static class DebuggingOkhttpLibraryAccessors extends SubDependencyFactory {

        public DebuggingOkhttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for logging (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLogging() {
                return create("debugging.okhttp.logging");
        }

    }

    public static class GoogleLibraryAccessors extends SubDependencyFactory {
        private final GoogleAccompanistLibraryAccessors laccForGoogleAccompanistLibraryAccessors = new GoogleAccompanistLibraryAccessors(owner);
        private final GoogleFirebaseLibraryAccessors laccForGoogleFirebaseLibraryAccessors = new GoogleFirebaseLibraryAccessors(owner);
        private final GoogleHiltLibraryAccessors laccForGoogleHiltLibraryAccessors = new GoogleHiltLibraryAccessors(owner);

        public GoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for kspPlugin (com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKspPlugin() {
                return create("google.kspPlugin");
        }

            /**
             * Creates a dependency provider for material (com.google.android.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() {
                return create("google.material");
        }

            /**
             * Creates a dependency provider for protobuf (com.google.protobuf:protobuf-javalite)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getProtobuf() {
                return create("google.protobuf");
        }

            /**
             * Creates a dependency provider for servicesPlugin (com.google.gms:google-services)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getServicesPlugin() {
                return create("google.servicesPlugin");
        }

        /**
         * Returns the group of libraries at google.accompanist
         */
        public GoogleAccompanistLibraryAccessors getAccompanist() {
            return laccForGoogleAccompanistLibraryAccessors;
        }

        /**
         * Returns the group of libraries at google.firebase
         */
        public GoogleFirebaseLibraryAccessors getFirebase() {
            return laccForGoogleFirebaseLibraryAccessors;
        }

        /**
         * Returns the group of libraries at google.hilt
         */
        public GoogleHiltLibraryAccessors getHilt() {
            return laccForGoogleHiltLibraryAccessors;
        }

    }

    public static class GoogleAccompanistLibraryAccessors extends SubDependencyFactory {

        public GoogleAccompanistLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for navigation (com.google.accompanist:accompanist-navigation-material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNavigation() {
                return create("google.accompanist.navigation");
        }

            /**
             * Creates a dependency provider for systemuicontroller (com.google.accompanist:accompanist-systemuicontroller)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSystemuicontroller() {
                return create("google.accompanist.systemuicontroller");
        }

    }

    public static class GoogleFirebaseLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final GoogleFirebaseCrashlyticsLibraryAccessors laccForGoogleFirebaseCrashlyticsLibraryAccessors = new GoogleFirebaseCrashlyticsLibraryAccessors(owner);
        private final GoogleFirebasePerformanceLibraryAccessors laccForGoogleFirebasePerformanceLibraryAccessors = new GoogleFirebasePerformanceLibraryAccessors(owner);

        public GoogleFirebaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for firebase (com.google.firebase:firebase-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("google.firebase");
        }

        /**
         * Returns the group of libraries at google.firebase.crashlytics
         */
        public GoogleFirebaseCrashlyticsLibraryAccessors getCrashlytics() {
            return laccForGoogleFirebaseCrashlyticsLibraryAccessors;
        }

        /**
         * Returns the group of libraries at google.firebase.performance
         */
        public GoogleFirebasePerformanceLibraryAccessors getPerformance() {
            return laccForGoogleFirebasePerformanceLibraryAccessors;
        }

    }

    public static class GoogleFirebaseCrashlyticsLibraryAccessors extends SubDependencyFactory {

        public GoogleFirebaseCrashlyticsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradlePlugin (com.google.firebase:firebase-crashlytics-gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradlePlugin() {
                return create("google.firebase.crashlytics.gradlePlugin");
        }

    }

    public static class GoogleFirebasePerformanceLibraryAccessors extends SubDependencyFactory {

        public GoogleFirebasePerformanceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradlePlugin (com.google.firebase:perf-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradlePlugin() {
                return create("google.firebase.performance.gradlePlugin");
        }

    }

    public static class GoogleHiltLibraryAccessors extends SubDependencyFactory {

        public GoogleHiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.google.dagger:hilt-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("google.hilt.android");
        }

            /**
             * Creates a dependency provider for compiler (com.google.dagger:hilt-android-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("google.hilt.compiler");
        }

            /**
             * Creates a dependency provider for gradlePlugin (com.google.dagger:hilt-android-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradlePlugin() {
                return create("google.hilt.gradlePlugin");
        }

    }

    public static class JetbrainsLibraryAccessors extends SubDependencyFactory {
        private final JetbrainsCoroutinesLibraryAccessors laccForJetbrainsCoroutinesLibraryAccessors = new JetbrainsCoroutinesLibraryAccessors(owner);
        private final JetbrainsKotlinLibraryAccessors laccForJetbrainsKotlinLibraryAccessors = new JetbrainsKotlinLibraryAccessors(owner);

        public JetbrainsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jetbrains.coroutines
         */
        public JetbrainsCoroutinesLibraryAccessors getCoroutines() {
            return laccForJetbrainsCoroutinesLibraryAccessors;
        }

        /**
         * Returns the group of libraries at jetbrains.kotlin
         */
        public JetbrainsKotlinLibraryAccessors getKotlin() {
            return laccForJetbrainsKotlinLibraryAccessors;
        }

    }

    public static class JetbrainsCoroutinesLibraryAccessors extends SubDependencyFactory {

        public JetbrainsCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("jetbrains.coroutines.android");
        }

    }

    public static class JetbrainsKotlinLibraryAccessors extends SubDependencyFactory {

        public JetbrainsKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradlePlugin (org.jetbrains.kotlin:kotlin-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradlePlugin() {
                return create("jetbrains.kotlin.gradlePlugin");
        }

    }

    public static class JunitLibraryAccessors extends SubDependencyFactory {

        public JunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradlePlugin (de.mannodermaus.gradle.plugins:android-junit5)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradlePlugin() {
                return create("junit.gradlePlugin");
        }

    }

    public static class LottieLibraryAccessors extends SubDependencyFactory {

        public LottieLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (com.airbnb.android:lottie-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("lottie.compose");
        }

    }

    public static class SquareupLibraryAccessors extends SubDependencyFactory {
        private final SquareupRetrofitLibraryAccessors laccForSquareupRetrofitLibraryAccessors = new SquareupRetrofitLibraryAccessors(owner);
        private final SquareupWireLibraryAccessors laccForSquareupWireLibraryAccessors = new SquareupWireLibraryAccessors(owner);

        public SquareupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOkhttp() {
                return create("squareup.okhttp");
        }

        /**
         * Returns the group of libraries at squareup.retrofit
         */
        public SquareupRetrofitLibraryAccessors getRetrofit() {
            return laccForSquareupRetrofitLibraryAccessors;
        }

        /**
         * Returns the group of libraries at squareup.wire
         */
        public SquareupWireLibraryAccessors getWire() {
            return laccForSquareupWireLibraryAccessors;
        }

    }

    public static class SquareupRetrofitLibraryAccessors extends SubDependencyFactory {

        public SquareupRetrofitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for converter (com.squareup.retrofit2:converter-moshi)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConverter() {
                return create("squareup.retrofit.converter");
        }

            /**
             * Creates a dependency provider for core (com.squareup.retrofit2:retrofit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("squareup.retrofit.core");
        }

    }

    public static class SquareupWireLibraryAccessors extends SubDependencyFactory {

        public SquareupWireLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradlePlugin (com.squareup.wire:wire-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradlePlugin() {
                return create("squareup.wire.gradlePlugin");
        }

    }

    public static class TestLibraryAccessors extends SubDependencyFactory {
        private final TestAndroidxLibraryAccessors laccForTestAndroidxLibraryAccessors = new TestAndroidxLibraryAccessors(owner);
        private final TestJunitLibraryAccessors laccForTestJunitLibraryAccessors = new TestJunitLibraryAccessors(owner);

        public TestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for coroutines (org.jetbrains.kotlinx:kotlinx-coroutines-test)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCoroutines() {
                return create("test.coroutines");
        }

            /**
             * Creates a dependency provider for robolectric (org.robolectric:robolectric)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRobolectric() {
                return create("test.robolectric");
        }

            /**
             * Creates a dependency provider for turbine (app.cash.turbine:turbine)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTurbine() {
                return create("test.turbine");
        }

        /**
         * Returns the group of libraries at test.androidx
         */
        public TestAndroidxLibraryAccessors getAndroidx() {
            return laccForTestAndroidxLibraryAccessors;
        }

        /**
         * Returns the group of libraries at test.junit
         */
        public TestJunitLibraryAccessors getJunit() {
            return laccForTestJunitLibraryAccessors;
        }

    }

    public static class TestAndroidxLibraryAccessors extends SubDependencyFactory {

        public TestAndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("test.androidx.core");
        }

            /**
             * Creates a dependency provider for espressoCore (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEspressoCore() {
                return create("test.androidx.espressoCore");
        }

            /**
             * Creates a dependency provider for ext (androidx.test.ext:junit-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExt() {
                return create("test.androidx.ext");
        }

            /**
             * Creates a dependency provider for junit (androidx.test.ext:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() {
                return create("test.androidx.junit");
        }

            /**
             * Creates a dependency provider for rules (androidx.test:rules)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRules() {
                return create("test.androidx.rules");
        }

            /**
             * Creates a dependency provider for runner (androidx.test:runner)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRunner() {
                return create("test.androidx.runner");
        }

            /**
             * Creates a dependency provider for uiautomator (androidx.test.uiautomator:uiautomator)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUiautomator() {
                return create("test.androidx.uiautomator");
        }

    }

    public static class TestJunitLibraryAccessors extends SubDependencyFactory {

        public TestJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.junit.jupiter:junit-jupiter-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() {
                return create("test.junit.api");
        }

            /**
             * Creates a dependency provider for engine (org.junit.jupiter:junit-jupiter-engine)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEngine() {
                return create("test.junit.engine");
        }

            /**
             * Creates a dependency provider for old (junit:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOld() {
                return create("test.junit.old");
        }

            /**
             * Creates a dependency provider for oldParams (pl.pragmatists:JUnitParams)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOldParams() {
                return create("test.junit.oldParams");
        }

            /**
             * Creates a dependency provider for params (org.junit.jupiter:junit-jupiter-params)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getParams() {
                return create("test.junit.params");
        }

    }

    public static class WisnuLibraryAccessors extends SubDependencyFactory {
        private final WisnuFoundationLibraryAccessors laccForWisnuFoundationLibraryAccessors = new WisnuFoundationLibraryAccessors(owner);

        public WisnuLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at wisnu.foundation
         */
        public WisnuFoundationLibraryAccessors getFoundation() {
            return laccForWisnuFoundationLibraryAccessors;
        }

    }

    public static class WisnuFoundationLibraryAccessors extends SubDependencyFactory {
        private final WisnuFoundationCoreLibraryAccessors laccForWisnuFoundationCoreLibraryAccessors = new WisnuFoundationCoreLibraryAccessors(owner);
        private final WisnuFoundationLibLibraryAccessors laccForWisnuFoundationLibLibraryAccessors = new WisnuFoundationLibLibraryAccessors(owner);
        private final WisnuFoundationTestLibraryAccessors laccForWisnuFoundationTestLibraryAccessors = new WisnuFoundationTestLibraryAccessors(owner);

        public WisnuFoundationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at wisnu.foundation.core
         */
        public WisnuFoundationCoreLibraryAccessors getCore() {
            return laccForWisnuFoundationCoreLibraryAccessors;
        }

        /**
         * Returns the group of libraries at wisnu.foundation.lib
         */
        public WisnuFoundationLibLibraryAccessors getLib() {
            return laccForWisnuFoundationLibLibraryAccessors;
        }

        /**
         * Returns the group of libraries at wisnu.foundation.test
         */
        public WisnuFoundationTestLibraryAccessors getTest() {
            return laccForWisnuFoundationTestLibraryAccessors;
        }

    }

    public static class WisnuFoundationCoreLibraryAccessors extends SubDependencyFactory {

        public WisnuFoundationCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for analytics (com.github.wisnukurniawan.foundation:core-analytics)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnalytics() {
                return create("wisnu.foundation.core.analytics");
        }

            /**
             * Creates a dependency provider for datetime (com.github.wisnukurniawan.foundation:core-date-time)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatetime() {
                return create("wisnu.foundation.core.datetime");
        }

            /**
             * Creates a dependency provider for json (com.github.wisnukurniawan.foundation:core-json)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJson() {
                return create("wisnu.foundation.core.json");
        }

            /**
             * Creates a dependency provider for loggr (com.github.wisnukurniawan.foundation:core-loggr)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLoggr() {
                return create("wisnu.foundation.core.loggr");
        }

            /**
             * Creates a dependency provider for ui (com.github.wisnukurniawan.foundation:core-ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUi() {
                return create("wisnu.foundation.core.ui");
        }

            /**
             * Creates a dependency provider for viewmodel (com.github.wisnukurniawan.foundation:core-viewmodel)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewmodel() {
                return create("wisnu.foundation.core.viewmodel");
        }

    }

    public static class WisnuFoundationLibLibraryAccessors extends SubDependencyFactory {

        public WisnuFoundationLibLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for analyticsmanager (com.github.wisnukurniawan.foundation:lib-analytics-manager)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnalyticsmanager() {
                return create("wisnu.foundation.lib.analyticsmanager");
        }

            /**
             * Creates a dependency provider for lifecycleloggr (com.github.wisnukurniawan.foundation:lib-lifecycle-loggr)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLifecycleloggr() {
                return create("wisnu.foundation.lib.lifecycleloggr");
        }

    }

    public static class WisnuFoundationTestLibraryAccessors extends SubDependencyFactory {

        public WisnuFoundationTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for debug (com.github.wisnukurniawan.foundation:test-debug)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDebug() {
                return create("wisnu.foundation.test.debug");
        }

            /**
             * Creates a dependency provider for debugnoop (com.github.wisnukurniawan.foundation:test-debug-no-op)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDebugnoop() {
                return create("wisnu.foundation.test.debugnoop");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: accompanist (0.32.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAccompanist() { return getVersion("accompanist"); }

            /**
             * Returns the version associated to this alias: androidDesugarJdkLibs (2.0.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidDesugarJdkLibs() { return getVersion("androidDesugarJdkLibs"); }

            /**
             * Returns the version associated to this alias: androidGradlePlugin (8.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidGradlePlugin() { return getVersion("androidGradlePlugin"); }

            /**
             * Returns the version associated to this alias: androidxActivity (1.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxActivity() { return getVersion("androidxActivity"); }

            /**
             * Returns the version associated to this alias: androidxAppCompat (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxAppCompat() { return getVersion("androidxAppCompat"); }

            /**
             * Returns the version associated to this alias: androidxCompose (1.6.0-alpha06)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxCompose() { return getVersion("androidxCompose"); }

            /**
             * Returns the version associated to this alias: androidxComposeCompiler (1.5.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxComposeCompiler() { return getVersion("androidxComposeCompiler"); }

            /**
             * Returns the version associated to this alias: androidxComposeMaterial3 (1.2.0-alpha08)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxComposeMaterial3() { return getVersion("androidxComposeMaterial3"); }

            /**
             * Returns the version associated to this alias: androidxCore (1.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxCore() { return getVersion("androidxCore"); }

            /**
             * Returns the version associated to this alias: androidxDataStore (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxDataStore() { return getVersion("androidxDataStore"); }

            /**
             * Returns the version associated to this alias: androidxHiltNavigationCompose (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxHiltNavigationCompose() { return getVersion("androidxHiltNavigationCompose"); }

            /**
             * Returns the version associated to this alias: androidxLifecycle (2.6.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxLifecycle() { return getVersion("androidxLifecycle"); }

            /**
             * Returns the version associated to this alias: androidxMacroBenchmark (1.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxMacroBenchmark() { return getVersion("androidxMacroBenchmark"); }

            /**
             * Returns the version associated to this alias: androidxNavigation (2.7.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxNavigation() { return getVersion("androidxNavigation"); }

            /**
             * Returns the version associated to this alias: androidxProfileinstaller (1.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxProfileinstaller() { return getVersion("androidxProfileinstaller"); }

            /**
             * Returns the version associated to this alias: androidxStartup (1.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxStartup() { return getVersion("androidxStartup"); }

            /**
             * Returns the version associated to this alias: androidxWindow (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxWindow() { return getVersion("androidxWindow"); }

            /**
             * Returns the version associated to this alias: composeLottie (6.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getComposeLottie() { return getVersion("composeLottie"); }

            /**
             * Returns the version associated to this alias: composeWidget (1.0.0-alpha05)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getComposeWidget() { return getVersion("composeWidget"); }

            /**
             * Returns the version associated to this alias: firebase (32.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFirebase() { return getVersion("firebase"); }

            /**
             * Returns the version associated to this alias: hilt (2.48.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHilt() { return getVersion("hilt"); }

            /**
             * Returns the version associated to this alias: jUnit (5.10.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJUnit() { return getVersion("jUnit"); }

            /**
             * Returns the version associated to this alias: kotlin (1.9.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: kotlinxCoroutines (1.7.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinxCoroutines() { return getVersion("kotlinxCoroutines"); }

            /**
             * Returns the version associated to this alias: material (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial() { return getVersion("material"); }

            /**
             * Returns the version associated to this alias: okhttp (4.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkhttp() { return getVersion("okhttp"); }

            /**
             * Returns the version associated to this alias: protoWirePlugin (4.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getProtoWirePlugin() { return getVersion("protoWirePlugin"); }

            /**
             * Returns the version associated to this alias: protobuf (4.0.0-rc-2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getProtobuf() { return getVersion("protobuf"); }

            /**
             * Returns the version associated to this alias: retrofit (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRetrofit() { return getVersion("retrofit"); }

            /**
             * Returns the version associated to this alias: room (2.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("room"); }

            /**
             * Returns the version associated to this alias: wisnuFoundation (0.1.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getWisnuFoundation() { return getVersion("wisnuFoundation"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for networking which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.squareup.retrofit2:retrofit</li>
             *    <li>com.squareup.retrofit2:converter-moshi</li>
             *    <li>com.squareup.okhttp3:okhttp</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getNetworking() {
                return createBundle("networking");
            }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
