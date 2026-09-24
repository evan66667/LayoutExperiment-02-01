# LayoutExperiment-02-01
Android XML布局实验，共4个页面布局

## 项目简介
本Android项目使用Java + XML完成4个页面布局实验，包含主跳转页面、LinearLayout线性布局页面、TableLayout表格布局页面、ConstraintLayout约束布局页面，实现页面之间互相跳转。

## 开发环境
- 操作系统：Windows
- 开发工具：Android Studio
- 编程语言：Java
- 布局：XML
- 代码托管：GitHub

## 项目功能
1. 主页面：提供3个跳转按钮，点击分别进入三种布局页面
2. LinearLayout页面：线性布局，控件沿竖直方向排列，使用layout_weight权重均分屏幕空间
3. TableLayout页面：表格布局，利用TableRow实现网格表格界面
4. ConstraintLayout页面：约束布局，通过控件相对约束定位，适配不同手机屏幕

## 项目结构
LayoutExperiment-02-01
├── app/src/main
│ ├── java / 包名
│ │ ├── MainActivity.java // 主页面
│ │ ├── LinearActivity.java // 线性布局页面
│ │ ├── TableActivity.java // 表格布局页面
│ │ └── ConstraintActivity.java // 约束布局页面
│ └── res/layout
│ ├── activity_main.xml
│ ├── activity_linear.xml
│ ├── activity_table.xml
│ └── activity_constraint.xml
├── build.gradle.kts
├── settings.gradle.kts
└── .gitignore


## 运行说明
1. 使用Android Studio打开本项目
2. 等待Gradle同步完成
3. 启动Android模拟器，点击运行按钮
4. 在APP主界面点击按钮，切换不同布局页面

## 仓库信息
仓库地址：https://github.com/evan6667/LayoutExperiment-02-01
