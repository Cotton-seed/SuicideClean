# SuicideClean

# 自裁无痕 (SuicideClean)

## 核心原则

- 完全静默执行  
- 无任何消息提示  
- 无权限系统（所有玩家默认可用）  
- 无冷却时间  
- 极简实现（仅包含核心功能）

## 插件特点

### 绝对静默

- 无启用或禁用提示  
- 无自杀成功反馈  
- 无权限检查提示  
- 无任何日志输出  

### 极简实现

- 仅1个Java文件，32行代码  
- 无事件监听  
- 无配置文件  
- 无权限系统  

### 高效执行

- 直接将玩家生命值设置为0（最快最直接的方式）  
- 无延迟、无冷却  
- 无任何额外检查  

### 2b2t风格

- 玩家一加入即默认拥有自杀权限  
- 无管理功能  
- 无禁用选项  
- 专注核心自杀功能，简洁纯粹  

## 使用说明

玩家在游戏中输入以下任意命令，即刻死亡，且不会有任何消息提示：

/4
/514
/kill
/suicide
/die


执行效果：  
玩家生命值瞬间归零，仿佛什么都没发生过一样，无任何提示或记录。

## 设计理念

本插件严格遵循2b2t的传统：

- **零干扰**：不发送任何消息，无任何提示  
- **零权限**：所有玩家默认拥有使用权  
- **零延迟**：命令执行立即生效  
- **零配置**：无需任何设置，放入服务器即用  
- **零痕迹**：不在日志中记录自杀行为  

完全契合“无痕”理念，提供最纯粹的自杀功能，无任何多余元素。



# SuicideClean

## Core Principles

- Completely silent execution  
- No message feedback  
- No permission system (available to all players by default)  
- No cooldown  
- Minimal implementation (core functionality only)

## Features

### Absolute Silence

- No enable/disable messages  
- No suicide success feedback  
- No permission check messages  
- No log output  

### Minimal Implementation

- Only one Java file with 32 lines of code  
- No event listeners  
- No configuration files  
- No permission system  

### Efficient Execution

- Directly sets player's health to 0 (fastest and most direct method)  
- No delay or cooldown  
- No extra checks  

### 2b2t Style

- Players have permission immediately upon joining  
- No management functions  
- No disable option  
- Focused on core suicide functionality, simple and pure  

## Usage

Players can instantly kill themselves by typing any of the following commands in-game, with no message feedback:

/4
/514
/kill
/suicide
/die


Effect:  
The player's health immediately drops to zero, as if nothing happened, with no feedback or logs.

## Design Philosophy

This plugin strictly follows the 2b2t tradition:

- **Zero Interference**: No messages sent, no prompts given  
- **Zero Permissions**: All players have permission by default  
- **Zero Delay**: Commands execute immediately  
- **Zero Configuration**: No setup required, plug and play  
- **Zero Traces**: No suicide actions recorded in logs  

Fully embodying the "no-trace" philosophy, it offers the purest suicide functionality without any extra elements.
