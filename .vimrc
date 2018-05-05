"--------------------------------------------------------------"
" Vimの重複起動の警告を表示する
"--------------------------------------------------------------"
if str2nr(system("ps | grep vim | wc -l"), 10) >= 2
    echohl WarningMsg | echo "!!! vimを複数起動しています !!!" | echohl None
endif


"--------------------------------------------------------------"
" File Format
"--------------------------------------------------------------"
set fileformats=unix,dos
set fileencoding=utf-8


"--------------------------------------------------------------"
" Code Presentation
"--------------------------------------------------------------"
set number
set showmatch
set list
set listchars=tab:<-,trail:_
set scrolloff=8
filetype plugin indent on

"--------------------------------------------------------------"
" Indent
"--------------------------------------------------------------"
set expandtab
set shiftwidth=4
set tabstop=4
set softtabstop=4

set autoindent
set smartindent

"--------------------------------------------------------------"
" Search
"--------------------------------------------------------------"
set hls
set incsearch

"--------------------------------------------------------------"
" Backup And Swap
"--------------------------------------------------------------"
if !isdirectory('~/.vim/backup')
    call system('mkdir -p ~/.vim/backup')
endif

if !isdirectory('~/.vim/swap')
    call system('mkdir -p ~/.vim/swap')
endif

set backup
set backupdir=~/.vim/backup
set swapfile
set dir=~/.vim/swap


"--------------------------------------------------------------"
" Backup And Swap
"--------------------------------------------------------------"
noremap  <ESC><ESC> :noh<CR>
noremap  <C-d>      :sh<CR>

"noremap  <LEFT>  <NOP>
"noremap  <RIGHT> <NOP>
"noremap  <UP>    <NOP>
"noremap  <DOWN>  <NOP>
"noremap  <BS>    <NOP>
"inoremap <LEFT>  <NOP>
"inoremap <RIGHT> <NOP>
"inoremap <UP>    <NOP>
"inoremap <DOWN>  <NOP>
"inoremap <BS>    <NOP>

"--------------------------------------------------------------"
" Plugin Package Management (Dein)
"--------------------------------------------------------------"
if &compatible
  set nocompatible
endif

if !isdirectory('~/.vim/dein')
    call system('mkdir -p ~/.vim/dein/repos/github.com/Shougo/dein.vim')
    call system('git clone https://github.com/Shougo/dein.vim ~/.vim/dein/repos/github.com/Shougo/dein.vim')
endif

set runtimepath+=~/.vim/dein/repos/github.com/Shougo/dein.vim

if dein#load_state('~/.vim/dein')
  call dein#begin('~/.vim/dein')
      call dein#add('Shougo/dein.vim')
      call dein#add('Yggdroot/indentLine')
      call dein#add('hail2u/vim-css3-syntax')
      call dein#add('udalov/kotlin-vim')
  call dein#end()
  call dein#save_state()
endif

if dein#check_install()
  call dein#install()
endif

"--------------------------------------------------------------"
" Color Scheme
"--------------------------------------------------------------"
syntax on
colorscheme default
set t_Co=16
set background=light

highlight PreProc ctermfg=96
highlight Special ctermfg=96
highlight Comment ctermfg=12
highlight CursorLine cterm=None ctermbg=234
highlight MatchParen cterm=None ctermbg=None ctermfg=white

set clipboard=unnamedplus
