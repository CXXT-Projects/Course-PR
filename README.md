# Course-PR
[![Build Status](https://travis-ci.org/CXXT-Projects/Course-PR.svg?branch=master)](https://travis-ci.org/CXXT-Projects/Course-PR)

开放性创新实验3 

### 多人协作前必须掌握的基本技巧

- 使用本地的 Git ，在当前项目根目录处选择打开一个 git bash（Windows），macOS 的同学打开终端，cd 到当前项目的的根目录下，使用 git。
- 在准备修改代码的时候，记得使自己的项目与上游项目保持一致（最新），这样可以避免不必要的冲突。


### Contributing 步骤

- fork 这个项目，clone 自己的 fork 到本地。
- 进入自己 clone 项目的根目录，使用命令 `git remote -v` 查看是否有 `CXXT` 的上游地址。
- 如果只有自己 fork 的远程地址，没有上游项目的地址，那么使用命令 `git remote add upstream https://github.com/CXXT-Projects/Course-PR.git` 添加。
- 再次使用 `git remote -v` 查看是否有上游项目地址存在。
- 远程地址配置完毕，`git fetch upstream` 下载最新的上游代码。
- 使用 `git merge upstream/master` 更新自己的 master 分支代码为最新的（前提是切换到 master 分支，`git checkout master`）。
- 这时候就可以开始自己的修改工作了，新建一个分支 `git checkout -b your-branch-name`。
- 在新的分支上做出你自己的代码修改。
- 在项目根目录下使用 `git add .`添加全部修改。
- 使用 `git commit -m "修改相关的信息"` 提交这个修改。
- `git push origin` 或者是 `git push` 讲提交的修改推送到自己的 github fork 项目下。
- 从 github 自己的项目中对上游项目发起合并请求 (Pull Request)。
- PR 被上游仓库开发者审核、测试，最终合并。

### 保持fork的仓库以及本地仓库与原仓库一致
- 获取原仓库 git fetch upstream
- 将本地仓库同步到与原仓库一致 git merge upstream/master
- 将本地仓库push到自己fork的仓库 git push origin master

### 参考资料

- [與其它開發者的互動 - 使用 Pull Request（PR）](https://gitbook.tw/chapters/github/pull-request.html)
- [创建 Pull Request](https://github.com/geeeeeeeeek/git-recipes/wiki/3.3-%E5%88%9B%E5%BB%BA-Pull-Request)
- [《Pro Git》git 学习最好的教材](https://bingohuang.gitbooks.io/progit2/content/)
