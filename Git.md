## Git实战

### 第一章 快速入门

#### **1.1 Git的概述**

#### 1.2 版本控制的作用

#### 1.3 安装Git



### 第二章 基础命令

#### 1.1 步骤

- 进入管理文件夹

- 执行初始化命令

  ```
  git init
  ```

- 管理目录下文件状态

  ```
  git status
  ```

- 管理指定文件

  ```
  git add 文件名
  git add .
  ```

- 个人信息配置

  ```
  git config --global user.email "you@example.com"
  git config --global user.name "your Name"
  ```

- 生成版本

  ```
  git commit -m '版本信息'
  ```

- 查看版本记录

  ```
  git log
  ```

#### 1.2 回滚

- 回滚至之前版本

  ```
  git log
  git reset --hard 版本号
  ```

- 再回滚之后版本

  ```
  git reflog
  git reset -- hard 版本号
  ```

#### 1.3 分支

- 查看分支

  ```
  git branch
  ```

- 创建分支

  ```
  git branch 分支名称
  ```

- 切换分支

  ```
  git checkout 分支名称
  ```

- 删除分支

  ```
  git branch -d 分支名称
  ```

- 合并分支

  ```
  git merge 要合并的分支
  注意:切换分支再合并
  ```



### 第三章 GitHub

#### 1.1 home

- 给远程仓库起别名

  ```
  git remote add origin 远程仓库地址
  ```

- 本地向远程推送代码

  ```
  git push -u origin master
  ```

#### 1.2 company

- 克隆远程仓库代码

  ```
  git clone 远程仓库地址
  ```

- 切换分支

  ```
  git checkout dev
  ```

- 合并分支

  ```
  git merge master
  ```

- 修改代码，提交代码

  ```
  git add .
  git commit -m 'newcoding1'
  git push origin dev
  ```

#### 1.3 home

- 切换分支开发

  ```
  git checkout dev
  ```

- 修改代码，提交代码

  ```
  git add .
  git commit -m 'newcoding2'
  git push origin dev
  ```

  

### 第四章 rebase

