#import "Libs.h"

@implementation Libs
- (void)setStatusBarColor:(NSString *)colorHex darkIcons:(BOOL)darkIcons {
    // iOS implementation for setting status bar color
}

- (void)setNavigationBarColor:(NSString *)colorHex darkIcons:(BOOL)darkIcons {
    // iOS implementation for setting navigation bar color
}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeLibsSpecJSI>(params);
}

+ (NSString *)moduleName
{
  return @"Libs";
}

@end
